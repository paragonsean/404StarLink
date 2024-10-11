# ListSchemasRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cluster_identifier** | **str** |  | [optional] 
**connected_database** | **str** |  | [optional] 
**database** | **str** |  | 
**db_user** | **str** |  | [optional] 
**max_results** | **int** |  | [optional] 
**next_token** | **str** |  | [optional] 
**schema_pattern** | **str** |  | [optional] 
**secret_arn** | **str** |  | [optional] 
**workgroup_name** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.list_schemas_request import ListSchemasRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ListSchemasRequest from a JSON string
list_schemas_request_instance = ListSchemasRequest.from_json(json)
# print the JSON string representation of the object
print(ListSchemasRequest.to_json())

# convert the object into a dict
list_schemas_request_dict = list_schemas_request_instance.to_dict()
# create an instance of ListSchemasRequest from a dict
list_schemas_request_from_dict = ListSchemasRequest.from_dict(list_schemas_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


