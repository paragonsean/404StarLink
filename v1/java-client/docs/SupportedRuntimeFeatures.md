

# SupportedRuntimeFeatures

Supported runtime features of a connector version. This is passed to the management layer to add a new connector version by the connector developer. Details about how this proto is passed to the management layer is covered in this doc - go/runtime-manifest.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**actionApis** | **Boolean** | Specifies if the connector supports action apis like &#39;executeAction&#39;. |  [optional] |
|**entityApis** | **Boolean** | Specifies if the connector supports entity apis like &#39;createEntity&#39;. |  [optional] |
|**sqlQuery** | **Boolean** | Specifies if the connector supports &#39;ExecuteSqlQuery&#39; operation. |  [optional] |



