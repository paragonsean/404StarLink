# GetVoiceTemplateResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**voice_template_response** | [**VoiceTemplateResponse**](VoiceTemplateResponse.md) |  | 

## Example

```python
from openapi_client.models.get_voice_template_response import GetVoiceTemplateResponse

# TODO update the JSON string below
json = "{}"
# create an instance of GetVoiceTemplateResponse from a JSON string
get_voice_template_response_instance = GetVoiceTemplateResponse.from_json(json)
# print the JSON string representation of the object
print(GetVoiceTemplateResponse.to_json())

# convert the object into a dict
get_voice_template_response_dict = get_voice_template_response_instance.to_dict()
# create an instance of GetVoiceTemplateResponse from a dict
get_voice_template_response_from_dict = GetVoiceTemplateResponse.from_dict(get_voice_template_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


