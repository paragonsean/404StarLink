# UpdateBaiduChannelRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**baidu_channel_request** | [**UpdateBaiduChannelRequestBaiduChannelRequest**](UpdateBaiduChannelRequestBaiduChannelRequest.md) |  | 

## Example

```python
from openapi_client.models.update_baidu_channel_request import UpdateBaiduChannelRequest

# TODO update the JSON string below
json = "{}"
# create an instance of UpdateBaiduChannelRequest from a JSON string
update_baidu_channel_request_instance = UpdateBaiduChannelRequest.from_json(json)
# print the JSON string representation of the object
print(UpdateBaiduChannelRequest.to_json())

# convert the object into a dict
update_baidu_channel_request_dict = update_baidu_channel_request_instance.to_dict()
# create an instance of UpdateBaiduChannelRequest from a dict
update_baidu_channel_request_from_dict = UpdateBaiduChannelRequest.from_dict(update_baidu_channel_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


