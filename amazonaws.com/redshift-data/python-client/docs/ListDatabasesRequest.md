# ListDatabasesRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cluster_identifier** | **str** |  | [optional] 
**database** | **str** |  | 
**db_user** | **str** |  | [optional] 
**max_results** | **int** |  | [optional] 
**next_token** | **str** |  | [optional] 
**secret_arn** | **str** |  | [optional] 
**workgroup_name** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.list_databases_request import ListDatabasesRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ListDatabasesRequest from a JSON string
list_databases_request_instance = ListDatabasesRequest.from_json(json)
# print the JSON string representation of the object
print(ListDatabasesRequest.to_json())

# convert the object into a dict
list_databases_request_dict = list_databases_request_instance.to_dict()
# create an instance of ListDatabasesRequest from a dict
list_databases_request_from_dict = ListDatabasesRequest.from_dict(list_databases_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


