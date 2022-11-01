# PreReceiveEnvironmentDownload


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**downloaded_at** | **str** |  | [optional] 
**message** | **str** |  | [optional] 
**state** | **str** |  | [optional] 
**url** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.pre_receive_environment_download import PreReceiveEnvironmentDownload

# TODO update the JSON string below
json = "{}"
# create an instance of PreReceiveEnvironmentDownload from a JSON string
pre_receive_environment_download_instance = PreReceiveEnvironmentDownload.from_json(json)
# print the JSON string representation of the object
print(PreReceiveEnvironmentDownload.to_json())

# convert the object into a dict
pre_receive_environment_download_dict = pre_receive_environment_download_instance.to_dict()
# create an instance of PreReceiveEnvironmentDownload from a dict
pre_receive_environment_download_from_dict = PreReceiveEnvironmentDownload.from_dict(pre_receive_environment_download_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


