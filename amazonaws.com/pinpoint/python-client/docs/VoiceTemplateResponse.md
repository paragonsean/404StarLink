# VoiceTemplateResponse

Provides information about the content and settings for a message template that can be used in messages that are sent through the voice channel.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**arn** | **str** |  | [optional] 
**body** | **str** |  | [optional] 
**creation_date** | **str** |  | 
**default_substitutions** | **str** |  | [optional] 
**language_code** | **str** |  | [optional] 
**last_modified_date** | **str** |  | 
**tags** | **Dict** |  | [optional] 
**template_description** | **str** |  | [optional] 
**template_name** | **str** |  | 
**template_type** | [**TemplateType**](TemplateType.md) |  | 
**version** | **str** |  | [optional] 
**voice_id** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.voice_template_response import VoiceTemplateResponse

# TODO update the JSON string below
json = "{}"
# create an instance of VoiceTemplateResponse from a JSON string
voice_template_response_instance = VoiceTemplateResponse.from_json(json)
# print the JSON string representation of the object
print(VoiceTemplateResponse.to_json())

# convert the object into a dict
voice_template_response_dict = voice_template_response_instance.to_dict()
# create an instance of VoiceTemplateResponse from a dict
voice_template_response_from_dict = VoiceTemplateResponse.from_dict(voice_template_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


