# PreReceiveEnvironmentDownloadStatus


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**downloaded_at** | **str** |  | [optional] 
**message** | **str** |  | [optional] 
**state** | **str** |  | [optional] 
**url** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.pre_receive_environment_download_status import PreReceiveEnvironmentDownloadStatus

# TODO update the JSON string below
json = "{}"
# create an instance of PreReceiveEnvironmentDownloadStatus from a JSON string
pre_receive_environment_download_status_instance = PreReceiveEnvironmentDownloadStatus.from_json(json)
# print the JSON string representation of the object
print(PreReceiveEnvironmentDownloadStatus.to_json())

# convert the object into a dict
pre_receive_environment_download_status_dict = pre_receive_environment_download_status_instance.to_dict()
# create an instance of PreReceiveEnvironmentDownloadStatus from a dict
pre_receive_environment_download_status_from_dict = PreReceiveEnvironmentDownloadStatus.from_dict(pre_receive_environment_download_status_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


