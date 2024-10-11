# ProofreaderWithLanguage


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**full_name** | **str** | full name of the proofreader | [optional] 
**id** | **float** | proofreader id | [optional] 
**language** | **str** | language code (i.e en-US) | [optional] 
**vendor_link** | **str** | link to the vendor that can be only used in motaword admin application | [optional] 

## Example

```python
from openapi_client.models.proofreader_with_language import ProofreaderWithLanguage

# TODO update the JSON string below
json = "{}"
# create an instance of ProofreaderWithLanguage from a JSON string
proofreader_with_language_instance = ProofreaderWithLanguage.from_json(json)
# print the JSON string representation of the object
print(ProofreaderWithLanguage.to_json())

# convert the object into a dict
proofreader_with_language_dict = proofreader_with_language_instance.to_dict()
# create an instance of ProofreaderWithLanguage from a dict
proofreader_with_language_from_dict = ProofreaderWithLanguage.from_dict(proofreader_with_language_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


