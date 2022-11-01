# PreReceiveEnvironment


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**created_at** | **str** |  | [optional] 
**default_environment** | **bool** |  | [optional] 
**download** | [**PreReceiveEnvironmentDownload**](PreReceiveEnvironmentDownload.md) |  | [optional] 
**hooks_count** | **int** |  | [optional] 
**html_url** | **str** |  | [optional] 
**id** | **int** |  | [optional] 
**image_url** | **str** |  | [optional] 
**name** | **str** |  | [optional] 
**url** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.pre_receive_environment import PreReceiveEnvironment

# TODO update the JSON string below
json = "{}"
# create an instance of PreReceiveEnvironment from a JSON string
pre_receive_environment_instance = PreReceiveEnvironment.from_json(json)
# print the JSON string representation of the object
print(PreReceiveEnvironment.to_json())

# convert the object into a dict
pre_receive_environment_dict = pre_receive_environment_instance.to_dict()
# create an instance of PreReceiveEnvironment from a dict
pre_receive_environment_from_dict = PreReceiveEnvironment.from_dict(pre_receive_environment_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


