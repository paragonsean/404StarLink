# VendorProjectPair


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**currency** | **str** |  | [optional] [default to 'usd']
**is_proofreader** | **bool** | Indicates if the vendor be able to proofred this pair | [optional] 
**proofreader** | [**User**](User.md) |  | [optional] 
**proofreading_rate** | **float** |  | [optional] 
**source_language** | **str** | Source language code | [optional] 
**target_language** | **str** | Target language code | [optional] 
**translation_rate** | **float** |  | [optional] 

## Example

```python
from openapi_client.models.vendor_project_pair import VendorProjectPair

# TODO update the JSON string below
json = "{}"
# create an instance of VendorProjectPair from a JSON string
vendor_project_pair_instance = VendorProjectPair.from_json(json)
# print the JSON string representation of the object
print(VendorProjectPair.to_json())

# convert the object into a dict
vendor_project_pair_dict = vendor_project_pair_instance.to_dict()
# create an instance of VendorProjectPair from a dict
vendor_project_pair_from_dict = VendorProjectPair.from_dict(vendor_project_pair_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


