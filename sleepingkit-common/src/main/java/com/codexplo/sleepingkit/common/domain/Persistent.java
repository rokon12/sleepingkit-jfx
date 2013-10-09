package com.codexplo.sleepingkit.common.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * User: Bazlur Rahman Rokon
 * Date: 10/9/13 - 6:29 PM
 */

@MappedSuperclass
public class Persistent implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private Date created;
    private Date updated;
    @Version
    private long version;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    public long getVersion() {
        return version;
    }

    public void setVersion(long version) {
        this.version = version;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Persistent{");
        sb.append("id=").append(id);
        sb.append(", created=").append(created);
        sb.append(", updated=").append(updated);
        sb.append(", version=").append(version);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Persistent)) return false;

        Persistent that = (Persistent) o;

        if (id != that.id) return false;
        if (version != that.version) return false;
        if (created != null ? !created.equals(that.created) : that.created != null) return false;
        if (updated != null ? !updated.equals(that.updated) : that.updated != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (created != null ? created.hashCode() : 0);
        result = 31 * result + (updated != null ? updated.hashCode() : 0);
        result = 31 * result + (int) (version ^ (version >>> 32));
        return result;
    }



}
