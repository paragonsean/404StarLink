# InvitedVendorsByLanguage


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**invited_vendors** | [**List[InvitedVendor]**](InvitedVendor.md) | Invited vendors for this target language | [optional] 
**target_language** | **str** | Target Language that the vendors invited for | [optional] 

## Example

```python
from openapi_client.models.invited_vendors_by_language import InvitedVendorsByLanguage

# TODO update the JSON string below
json = "{}"
# create an instance of InvitedVendorsByLanguage from a JSON string
invited_vendors_by_language_instance = InvitedVendorsByLanguage.from_json(json)
# print the JSON string representation of the object
print(InvitedVendorsByLanguage.to_json())

# convert the object into a dict
invited_vendors_by_language_dict = invited_vendors_by_language_instance.to_dict()
# create an instance of InvitedVendorsByLanguage from a dict
invited_vendors_by_language_from_dict = InvitedVendorsByLanguage.from_dict(invited_vendors_by_language_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


