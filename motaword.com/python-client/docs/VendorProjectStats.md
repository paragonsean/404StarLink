# VendorProjectStats


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**invited** | **int** | total number of projects that this user was invited to. TODO this key is to replace \&quot;total\&quot; key due to naming ambiguity. | [optional] 
**total** | **int** | total number of projects that this user was invited to. | [optional] 
**worked** | **int** | total number of projects that this user actually worked on. | [optional] 

## Example

```python
from openapi_client.models.vendor_project_stats import VendorProjectStats

# TODO update the JSON string below
json = "{}"
# create an instance of VendorProjectStats from a JSON string
vendor_project_stats_instance = VendorProjectStats.from_json(json)
# print the JSON string representation of the object
print(VendorProjectStats.to_json())

# convert the object into a dict
vendor_project_stats_dict = vendor_project_stats_instance.to_dict()
# create an instance of VendorProjectStats from a dict
vendor_project_stats_from_dict = VendorProjectStats.from_dict(vendor_project_stats_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


