# VendorWordStats


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**approved** | **int** | total number of words that this user has approved so far. | [optional] 
**translated** | **int** | total number of words that this user has translated so far. | [optional] 

## Example

```python
from openapi_client.models.vendor_word_stats import VendorWordStats

# TODO update the JSON string below
json = "{}"
# create an instance of VendorWordStats from a JSON string
vendor_word_stats_instance = VendorWordStats.from_json(json)
# print the JSON string representation of the object
print(VendorWordStats.to_json())

# convert the object into a dict
vendor_word_stats_dict = vendor_word_stats_instance.to_dict()
# create an instance of VendorWordStats from a dict
vendor_word_stats_from_dict = VendorWordStats.from_dict(vendor_word_stats_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


