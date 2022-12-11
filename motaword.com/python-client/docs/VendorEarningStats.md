# VendorEarningStats


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**total** | **float** | total amount of USD that this user has earned in the platform so far. | [optional] 

## Example

```python
from openapi_client.models.vendor_earning_stats import VendorEarningStats

# TODO update the JSON string below
json = "{}"
# create an instance of VendorEarningStats from a JSON string
vendor_earning_stats_instance = VendorEarningStats.from_json(json)
# print the JSON string representation of the object
print(VendorEarningStats.to_json())

# convert the object into a dict
vendor_earning_stats_dict = vendor_earning_stats_instance.to_dict()
# create an instance of VendorEarningStats from a dict
vendor_earning_stats_from_dict = VendorEarningStats.from_dict(vendor_earning_stats_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


