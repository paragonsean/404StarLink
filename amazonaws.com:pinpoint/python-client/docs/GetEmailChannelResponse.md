# GetEmailChannelResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**email_channel_response** | [**EmailChannelResponse**](EmailChannelResponse.md) |  | 

## Example

```python
from openapi_client.models.get_email_channel_response import GetEmailChannelResponse

# TODO update the JSON string below
json = "{}"
# create an instance of GetEmailChannelResponse from a JSON string
get_email_channel_response_instance = GetEmailChannelResponse.from_json(json)
# print the JSON string representation of the object
print(GetEmailChannelResponse.to_json())

# convert the object into a dict
get_email_channel_response_dict = get_email_channel_response_instance.to_dict()
# create an instance of GetEmailChannelResponse from a dict
get_email_channel_response_from_dict = GetEmailChannelResponse.from_dict(get_email_channel_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


