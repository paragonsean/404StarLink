# DeleteEmailChannelResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**email_channel_response** | [**EmailChannelResponse**](EmailChannelResponse.md) |  | 

## Example

```python
from openapi_client.models.delete_email_channel_response import DeleteEmailChannelResponse

# TODO update the JSON string below
json = "{}"
# create an instance of DeleteEmailChannelResponse from a JSON string
delete_email_channel_response_instance = DeleteEmailChannelResponse.from_json(json)
# print the JSON string representation of the object
print(DeleteEmailChannelResponse.to_json())

# convert the object into a dict
delete_email_channel_response_dict = delete_email_channel_response_instance.to_dict()
# create an instance of DeleteEmailChannelResponse from a dict
delete_email_channel_response_from_dict = DeleteEmailChannelResponse.from_dict(delete_email_channel_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


