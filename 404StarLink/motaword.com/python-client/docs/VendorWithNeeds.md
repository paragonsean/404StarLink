# VendorWithNeeds


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**matched_needs** | [**List[FileNeedsVendor]**](FileNeedsVendor.md) |  | [optional] 
**user_id** | **int** |  | [optional] 

## Example

```python
from openapi_client.models.vendor_with_needs import VendorWithNeeds

# TODO update the JSON string below
json = "{}"
# create an instance of VendorWithNeeds from a JSON string
vendor_with_needs_instance = VendorWithNeeds.from_json(json)
# print the JSON string representation of the object
print(VendorWithNeeds.to_json())

# convert the object into a dict
vendor_with_needs_dict = vendor_with_needs_instance.to_dict()
# create an instance of VendorWithNeeds from a dict
vendor_with_needs_from_dict = VendorWithNeeds.from_dict(vendor_with_needs_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


