package apimodels;

import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import com.fasterxml.jackson.annotation.JsonCreator;

/**
 * CurveType is the type of cryptographic curve associated with a PublicKey.  * secp256k1: SEC compressed - `33 bytes` (https://secg.org/sec1-v2.pdf#subsubsection.2.3.3) * edwards25519: `y (255-bits) || x-sign-bit (1-bit)` - `32 bytes` (https://ed25519.cr.yp.to/ed25519-20110926.pdf)
 */
public enum CurveType {
  
  SECP256K1("secp256k1"),
  
  EDWARDS25519("edwards25519");

  private final String value;

  CurveType(String value) {
    this.value = value;
  }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static CurveType fromValue(String value) {
    for (CurveType b : CurveType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}

