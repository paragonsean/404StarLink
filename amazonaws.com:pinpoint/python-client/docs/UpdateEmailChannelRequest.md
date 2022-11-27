# UpdateEmailChannelRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**email_channel_request** | [**UpdateEmailChannelRequestEmailChannelRequest**](UpdateEmailChannelRequestEmailChannelRequest.md) |  | 

## Example

```python
from openapi_client.models.update_email_channel_request import UpdateEmailChannelRequest

# TODO update the JSON string below
json = "{}"
# create an instance of UpdateEmailChannelRequest from a JSON string
update_email_channel_request_instance = UpdateEmailChannelRequest.from_json(json)
# print the JSON string representation of the object
print(UpdateEmailChannelRequest.to_json())

# convert the object into a dict
update_email_channel_request_dict = update_email_channel_request_instance.to_dict()
# create an instance of UpdateEmailChannelRequest from a dict
update_email_channel_request_from_dict = UpdateEmailChannelRequest.from_dict(update_email_channel_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


