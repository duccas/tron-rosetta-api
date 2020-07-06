package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
/**
 * When fetching data by BlockIdentifier, it may be possible to only specify the index or hash. If neither property is specified, it is assumed that the client is making a request at the current block.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2020-07-01T16:39:23.248338+08:00[Asia/Shanghai]")

@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class PartialBlockIdentifier   {
  @JsonProperty("index")
  private Long index;

  @JsonProperty("hash")
  private String hash;

  public PartialBlockIdentifier index(Long index) {
    this.index = index;
    return this;
  }

   /**
   * Get index
   * @return index
  **/
    public Long getIndex() {
    return index;
  }

  public void setIndex(Long index) {
    this.index = index;
  }

  public PartialBlockIdentifier hash(String hash) {
    this.hash = hash;
    return this;
  }

   /**
   * Get hash
   * @return hash
  **/
    public String getHash() {
    return hash;
  }

  public void setHash(String hash) {
    this.hash = hash;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PartialBlockIdentifier partialBlockIdentifier = (PartialBlockIdentifier) o;
    return Objects.equals(index, partialBlockIdentifier.index) &&
        Objects.equals(hash, partialBlockIdentifier.hash);
  }

  @Override
  public int hashCode() {
    return Objects.hash(index, hash);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PartialBlockIdentifier {\n");
    
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    hash: ").append(toIndentedString(hash)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

