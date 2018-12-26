package cn.fuelteam.data.dto;

import java.io.Serializable;

public class OperationDto implements Serializable {

    private static final long serialVersionUID = 2230749178717946440L;

    private Long id;

    private String contents;

    public Long getId() {
        return id;
    }

    public OperationDto setId(Long id) {
        this.id = id;
        return this;
    }

    public String getContents() {
        return contents;
    }

    public OperationDto setContents(String contents) {
        this.contents = contents == null ? null : contents.trim();
        return this;
    }
}
