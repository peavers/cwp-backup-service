package space.swordfish.silverstripe.service.silverstripe.domain;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.github.jasminb.jsonapi.annotations.Type;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@Type("snapshot-request")
public class SnapshotRequest extends BaseResource {
    String projectId;
    String environment;
    String mode;
}