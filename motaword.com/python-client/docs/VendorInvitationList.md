# VendorInvitationList


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**vendors** | [**List[VendorWithNeeds]**](VendorWithNeeds.md) |  | [optional] 

## Example

```python
from openapi_client.models.vendor_invitation_list import VendorInvitationList

# TODO update the JSON string below
json = "{}"
# create an instance of VendorInvitationList from a JSON string
vendor_invitation_list_instance = VendorInvitationList.from_json(json)
# print the JSON string representation of the object
print(VendorInvitationList.to_json())

# convert the object into a dict
vendor_invitation_list_dict = vendor_invitation_list_instance.to_dict()
# create an instance of VendorInvitationList from a dict
vendor_invitation_list_from_dict = VendorInvitationList.from_dict(vendor_invitation_list_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


