# UpdateEmailChannelResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**email_channel_response** | [**EmailChannelResponse**](EmailChannelResponse.md) |  | 

## Example

```python
from openapi_client.models.update_email_channel_response import UpdateEmailChannelResponse

# TODO update the JSON string below
json = "{}"
# create an instance of UpdateEmailChannelResponse from a JSON string
update_email_channel_response_instance = UpdateEmailChannelResponse.from_json(json)
# print the JSON string representation of the object
print(UpdateEmailChannelResponse.to_json())

# convert the object into a dict
update_email_channel_response_dict = update_email_channel_response_instance.to_dict()
# create an instance of UpdateEmailChannelResponse from a dict
update_email_channel_response_from_dict = UpdateEmailChannelResponse.from_dict(update_email_channel_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


