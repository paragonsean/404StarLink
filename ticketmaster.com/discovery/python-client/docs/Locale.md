# Locale


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**country** | **str** |  | [optional] 
**display_country** | **str** |  | [optional] 
**display_language** | **str** |  | [optional] 
**display_name** | **str** |  | [optional] 
**display_script** | **str** |  | [optional] 
**display_variant** | **str** |  | [optional] 
**extension_keys** | **List[str]** |  | [optional] 
**iso3_country** | **str** |  | [optional] 
**iso3_language** | **str** |  | [optional] 
**language** | **str** |  | [optional] 
**script** | **str** |  | [optional] 
**unicode_locale_attributes** | **List[str]** |  | [optional] 
**unicode_locale_keys** | **List[str]** |  | [optional] 
**variant** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.locale import Locale

# TODO update the JSON string below
json = "{}"
# create an instance of Locale from a JSON string
locale_instance = Locale.from_json(json)
# print the JSON string representation of the object
print(Locale.to_json())

# convert the object into a dict
locale_dict = locale_instance.to_dict()
# create an instance of Locale from a dict
locale_from_dict = Locale.from_dict(locale_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


