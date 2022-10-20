# PutSourceServerActionRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**action_id** | **str** | Source server post migration custom action ID. | 
**action_name** | **str** | Source server post migration custom action name. | 
**active** | **bool** | Source server post migration custom action active status. | [optional] 
**category** | **str** | Source server post migration custom action category. | [optional] 
**description** | **str** | Source server post migration custom action description. | [optional] 
**document_identifier** | **str** | Source server post migration custom action document identifier. | 
**document_version** | **str** | Source server post migration custom action document version. | [optional] 
**external_parameters** | [**Dict[str, SsmExternalParameter]**](SsmExternalParameter.md) | Source server post migration custom action external parameters. | [optional] 
**must_succeed_for_cutover** | **bool** | Source server post migration custom action must succeed for cutover. | [optional] 
**order** | **int** | Source server post migration custom action order. | 
**parameters** | **Dict[str, List[SsmParameterStoreParameter]]** | Source server post migration custom action parameters. | [optional] 
**source_server_id** | **str** | Source server ID. | 
**timeout_seconds** | **int** | Source server post migration custom action timeout in seconds. | [optional] 

## Example

```python
from openapi_client.models.put_source_server_action_request import PutSourceServerActionRequest

# TODO update the JSON string below
json = "{}"
# create an instance of PutSourceServerActionRequest from a JSON string
put_source_server_action_request_instance = PutSourceServerActionRequest.from_json(json)
# print the JSON string representation of the object
print(PutSourceServerActionRequest.to_json())

# convert the object into a dict
put_source_server_action_request_dict = put_source_server_action_request_instance.to_dict()
# create an instance of PutSourceServerActionRequest from a dict
put_source_server_action_request_from_dict = PutSourceServerActionRequest.from_dict(put_source_server_action_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


