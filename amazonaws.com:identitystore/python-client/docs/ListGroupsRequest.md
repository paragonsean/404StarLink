# ListGroupsRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**identity_store_id** | **str** |  | 
**max_results** | **int** |  | [optional] 
**next_token** | **str** |  | [optional] 
**filters** | **List** |  | [optional] 

## Example

```python
from openapi_client.models.list_groups_request import ListGroupsRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ListGroupsRequest from a JSON string
list_groups_request_instance = ListGroupsRequest.from_json(json)
# print the JSON string representation of the object
print(ListGroupsRequest.to_json())

# convert the object into a dict
list_groups_request_dict = list_groups_request_instance.to_dict()
# create an instance of ListGroupsRequest from a dict
list_groups_request_from_dict = ListGroupsRequest.from_dict(list_groups_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


