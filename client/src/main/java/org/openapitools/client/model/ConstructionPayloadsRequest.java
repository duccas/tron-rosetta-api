/*
 * Rosetta
 * Build Once. Integrate Your Blockchain Everywhere.
 *
 * The version of the OpenAPI document: 1.4.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.NetworkIdentifier;
import org.openapitools.client.model.Operation;

/**
 * ConstructionPayloadsRequest is the request to &#x60;/construction/payloads&#x60;. It contains the network, a slice of operations, and arbitrary metadata that was returned by the call to &#x60;/construction/metadata&#x60;.
 */
@ApiModel(description = "ConstructionPayloadsRequest is the request to `/construction/payloads`. It contains the network, a slice of operations, and arbitrary metadata that was returned by the call to `/construction/metadata`.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-07-01T16:34:45.305718+08:00[Asia/Shanghai]")
public class ConstructionPayloadsRequest {
  public static final String SERIALIZED_NAME_NETWORK_IDENTIFIER = "network_identifier";
  @SerializedName(SERIALIZED_NAME_NETWORK_IDENTIFIER)
  private NetworkIdentifier networkIdentifier;

  public static final String SERIALIZED_NAME_OPERATIONS = "operations";
  @SerializedName(SERIALIZED_NAME_OPERATIONS)
  private List<Operation> operations = new ArrayList<Operation>();

  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private Object metadata;


  public ConstructionPayloadsRequest networkIdentifier(NetworkIdentifier networkIdentifier) {
    
    this.networkIdentifier = networkIdentifier;
    return this;
  }

   /**
   * Get networkIdentifier
   * @return networkIdentifier
  **/
  @ApiModelProperty(required = true, value = "")

  public NetworkIdentifier getNetworkIdentifier() {
    return networkIdentifier;
  }


  public void setNetworkIdentifier(NetworkIdentifier networkIdentifier) {
    this.networkIdentifier = networkIdentifier;
  }


  public ConstructionPayloadsRequest operations(List<Operation> operations) {
    
    this.operations = operations;
    return this;
  }

  public ConstructionPayloadsRequest addOperationsItem(Operation operationsItem) {
    this.operations.add(operationsItem);
    return this;
  }

   /**
   * Get operations
   * @return operations
  **/
  @ApiModelProperty(required = true, value = "")

  public List<Operation> getOperations() {
    return operations;
  }


  public void setOperations(List<Operation> operations) {
    this.operations = operations;
  }


  public ConstructionPayloadsRequest metadata(Object metadata) {
    
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Object getMetadata() {
    return metadata;
  }


  public void setMetadata(Object metadata) {
    this.metadata = metadata;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConstructionPayloadsRequest constructionPayloadsRequest = (ConstructionPayloadsRequest) o;
    return Objects.equals(this.networkIdentifier, constructionPayloadsRequest.networkIdentifier) &&
        Objects.equals(this.operations, constructionPayloadsRequest.operations) &&
        Objects.equals(this.metadata, constructionPayloadsRequest.metadata);
  }

  @Override
  public int hashCode() {
    return Objects.hash(networkIdentifier, operations, metadata);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConstructionPayloadsRequest {\n");
    sb.append("    networkIdentifier: ").append(toIndentedString(networkIdentifier)).append("\n");
    sb.append("    operations: ").append(toIndentedString(operations)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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

