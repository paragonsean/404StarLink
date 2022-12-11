# InstantTranslationRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**contents** | **List[str]** | Simple list of strings to be translated. You can also choose to upload files instead of strings. | [optional] 
**documents** | [**List[FileAsData]**](FileAsData.md) | You can add as many files as you want in documents parameter. | [optional] 
**filters** | [**InstantTranslationFilter**](InstantTranslationFilter.md) |  | [optional] 
**meta** | **object** | Free-form meta data to attach to your instant translation request. This can be used in statistics and analytical dashboards. | [optional] 

## Example

```python
from openapi_client.models.instant_translation_request import InstantTranslationRequest

# TODO update the JSON string below
json = "{}"
# create an instance of InstantTranslationRequest from a JSON string
instant_translation_request_instance = InstantTranslationRequest.from_json(json)
# print the JSON string representation of the object
print(InstantTranslationRequest.to_json())

# convert the object into a dict
instant_translation_request_dict = instant_translation_request_instance.to_dict()
# create an instance of InstantTranslationRequest from a dict
instant_translation_request_from_dict = InstantTranslationRequest.from_dict(instant_translation_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


