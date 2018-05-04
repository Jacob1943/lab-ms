package me.ye.common;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.annotation.Version;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Jacob
 * @date 04/05/2018
 */

@Data
public class BaseEntity {

    @JsonIgnore
    @Version
    private Long version;

    @CreatedDate
    private Date createdDate;

    @LastModifiedDate
    private Date lastModifiedDate;
}
