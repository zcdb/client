// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: errors.proto

package com.vearch.grpc.entity;

public final class Errors {
  private Errors() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Error_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Error_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    String[] descriptorData = {
      "\n\014errors.proto\".\n\005Error\022\030\n\004code\030\001 \001(\0162\n." +
      "ErrorEnum\022\013\n\003msg\030\002 \001(\t*\310\014\n\tErrorEnum\022\013\n\007" +
      "SUCCESS\020\000\022\022\n\016INTERNAL_ERROR\020\001\022\024\n\020NAME_OR" +
      "_PASSWORD\020\002\022\013\n\007SYSBUSY\020\003\022\017\n\013PARAM_ERROR\020" +
      "\004\022\017\n\013INVALID_CFG\020\005\022\013\n\007TIMEOUT\020\006\022\027\n\023SERVI" +
      "CE_UNAVAILABLE\020\007\022\023\n\017ZONE_NOT_EXISTS\020\010\022\031\n" +
      "\025LOCAL_ZONE_OPS_FAILED\020\t\022\014\n\010DUP_ZONE\020\n\022\n" +
      "\n\006DUP_DB\020\013\022\022\n\016INVALID_ENGINE\020\014\022\020\n\014DB_NOT" +
      "EXISTS\020\r\022\020\n\014DB_Not_Empty\020\016\022\r\n\tDUP_SPACE\020" +
      "\017\022\023\n\017SPACE_NOTEXISTS\020\020\022\032\n\026PARTITION_HAS_" +
      "TASK_NOW\020\021\022\026\n\022REPLICA_NOT_EXISTS\020\022\022\017\n\013DU" +
      "P_REPLICA\020\023\022\'\n#PARTITION_REPLICA_LEADER_" +
      "NOT_DELETE\020\024\022\020\n\014PS_NOTEXISTS\020\025\022\025\n\021PS_Alr" +
      "eady_Exists\020\026\022\032\n\026LOCAL_SPACE_OPS_FAILED\020" +
      "\027\022\027\n\023Local_PS_Ops_Failed\020\030\022\020\n\014GENID_FAIL" +
      "ED\020\031\022\025\n\021LOCALDB_OPTFAILED\020\032\022\030\n\024SPACE_SCH" +
      "EMA_INVALID\020\033\022\031\n\025RPC_GET_CLIENT_FAILED\020\034" +
      "\022\024\n\020RPC_INVALID_RESP\020\035\022\025\n\021RPC_INVOKE_FAI" +
      "LED\020\036\022\023\n\017RPC_PARAM_ERROR\020\037\022\030\n\024METHOD_NOT" +
      "_IMPLEMENT\020 \022\023\n\017USER_NOT_EXISTS\020!\022\014\n\010DUP" +
      "_USER\020\"\022\023\n\017USER_OPS_FAILED\020#\022\031\n\025AUTHENTI" +
      "CATION_FAILED\020$\022\025\n\021REGION_NOT_EXISTS\020%\022\034" +
      "\n\030MASTER_PS_CAN_NOT_SELECT\020&\022\037\n\033MASTER_P" +
      "S_NOT_ENOUGH_SELECT\020\'\022\027\n\023PARTITION_DUPLI" +
      "CATE\020(\022\027\n\023PARTITION_NOT_EXIST\020)\022\030\n\024PARTI" +
      "TION_NOT_LEADER\020*\022\027\n\023PARTITION_NO_LEADER" +
      "\020+\022\027\n\023PARTITION_REQ_PARAM\020,\022\037\n\033PARTITON_" +
      "ENGINENAME_INVALID\020-\022#\n\037UNKNOWN_PARTITIO" +
      "N_RAFT_CMD_TYPE\020.\022 \n\034MASTER_SERVER_IS_NO" +
      "T_RUNNING\020/\022\030\n\024PARTITION_IS_INVALID\0200\022\027\n" +
      "\023PARTITION_IS_CLOSED\0201\022\026\n\022DOCUMENT_NOT_E" +
      "XIST\0202\022\022\n\016DOCUMENT_EXIST\0203\022\034\n\030DOCUMENT_M" +
      "UST_HAS_SOURCE\0204\022\036\n\032PULL_OUT_VERSION_NOT" +
      "_MATCH\0205\022(\n$FUNC_CAN_NOT_INVOKE_IN_FROZE" +
      "N_ENGINE\0206\022\027\n\023ROUTER_NO_PS_CLIENT\0207\022\032\n\026R" +
      "OUTER_CALL_PS_RPC_ERR\0208\022!\n\035GAMMA_SEARCH_" +
      "QUERY_NUM_LESS_0\0209\022 \n\034GAMMA_SEARCH_NO_CR" +
      "EATE_INDEX\020:\022 \n\034GAMMA_SEARCH_INDEX_QUERY" +
      "_ERR\020;\022\032\n\026GAMMA_SEARCH_OTHER_ERR\020<\022\026\n\022Pr" +
      "imary_IS_INVALID\020=\022\030\n\024PARSING_RESULT_ERR" +
      "OR\020>\022\033\n\027Create_RpcClient_Failed\020F\022\031\n\025Cal" +
      "l_RpcClient_Failed\020G\022\013\n\007RECOVER\020d*O\n\020Sea" +
      "rchResultCode\022\022\n\016SEARCH_SUCCESS\020\000\022\025\n\021IND" +
      "EX_NOT_BUILDED\020\001\022\020\n\014SEARCH_ERROR\020\002B\032\n\026co" +
      "m.vearch.grpc.entityP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Error_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Error_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Error_descriptor,
        new String[] { "Code", "Msg", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}