# AvailableVendorsFilter


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**corporate_id** | **float** | Corporate account ID to filter for vendor authorization | [optional] 
**manual_work_permission** | **bool** | Filter vendors for manual work permission | [optional] 
**source_language** | **str** | Source language code | [optional] 
**target_languages** | **List[str]** | List of target language codes. | [optional] 
**types** | **List[str]** | List of vendor types | [optional] 

## Example

```python
from openapi_client.models.available_vendors_filter import AvailableVendorsFilter

# TODO update the JSON string below
json = "{}"
# create an instance of AvailableVendorsFilter from a JSON string
available_vendors_filter_instance = AvailableVendorsFilter.from_json(json)
# print the JSON string representation of the object
print(AvailableVendorsFilter.to_json())

# convert the object into a dict
available_vendors_filter_dict = available_vendors_filter_instance.to_dict()
# create an instance of AvailableVendorsFilter from a dict
available_vendors_filter_from_dict = AvailableVendorsFilter.from_dict(available_vendors_filter_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


