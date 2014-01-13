########################################################
#
# Iris Service API
#
########################################################
namespace java com.talool.iris.thrift

typedef i64 Timestamp

exception IrisException_t {
  1: required i32 errorCode,
  2: required string errorDesc
}

struct Location_t {
  1: required double longitude;
  2: required double latitude;
}

struct CustomerMetadata_t {
  1: required string customerId,
  2: required string deviceId,
  3: optional string email,
  4: required string ipAddress,
  5: optional Location_t location;
}

service Iris_t {
   void getNotificationMessages(1:CustomerMetadata_t customerMetadata) throws (1:IrisException_t error);
}