# VendorTag


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**color** | **str** |  | [optional] 
**name** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.vendor_tag import VendorTag

# TODO update the JSON string below
json = "{}"
# create an instance of VendorTag from a JSON string
vendor_tag_instance = VendorTag.from_json(json)
# print the JSON string representation of the object
print(VendorTag.to_json())

# convert the object into a dict
vendor_tag_dict = vendor_tag_instance.to_dict()
# create an instance of VendorTag from a dict
vendor_tag_from_dict = VendorTag.from_dict(vendor_tag_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


