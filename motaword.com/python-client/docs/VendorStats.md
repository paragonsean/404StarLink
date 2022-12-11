# VendorStats


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**earnings** | [**VendorEarningStats**](VendorEarningStats.md) |  | [optional] 
**projects** | [**VendorProjectStats**](VendorProjectStats.md) |  | [optional] 
**words** | [**VendorWordStats**](VendorWordStats.md) |  | [optional] 

## Example

```python
from openapi_client.models.vendor_stats import VendorStats

# TODO update the JSON string below
json = "{}"
# create an instance of VendorStats from a JSON string
vendor_stats_instance = VendorStats.from_json(json)
# print the JSON string representation of the object
print(VendorStats.to_json())

# convert the object into a dict
vendor_stats_dict = vendor_stats_instance.to_dict()
# create an instance of VendorStats from a dict
vendor_stats_from_dict = VendorStats.from_dict(vendor_stats_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


