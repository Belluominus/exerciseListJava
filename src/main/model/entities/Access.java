package main.model.entities;

import java.time.Instant;

public class Access {
    private String name;
    private Instant instant;
    
    public Access() {
    }

    public Access(String name, Instant instant) {
        this.name = name;
        this.instant = instant;
    }

    public String getName() {
        return name;
    }
    
    public Instant getInstant() {
        return instant;
    }


    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Access other = (Access) obj;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }  
}
