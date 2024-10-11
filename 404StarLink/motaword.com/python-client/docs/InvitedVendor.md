# InvitedVendor


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**action** | **str** | Action to be taken | [optional] 
**email_open_rate** | **float** | Email opening rate of the vendor | [optional] 
**is_entered** | **bool** | Did the vendor enter the given project | [optional] 
**is_get_paid** | **bool** | Is vendor get ever paid? | [optional] 
**is_worked** | **bool** | Did the vendor work on the given project | [optional] 
**is_worked_in_any_project** | **bool** | Vendors working status in any project | [optional] 
**last_project_date** | **date** | Last project date | [optional] 
**project_status_when_interacted** | **float** | Project translation percentage when interacted with the vendor | [optional] 
**registration_date** | **date** | Registration date | [optional] 
**responsiveness** | **float** | Responsiveness of the vendor | [optional] 
**user_id** | **float** | Id in the Users | [optional] 
**vendor_id** | **float** | Id in the Vendors | [optional] 
**vendor_name** | **str** | The name of the vendor | [optional] 
**vendor_type** | **str** | Type of the vendor in the given project namely translator or proofreader | [optional] 

## Example

```python
from openapi_client.models.invited_vendor import InvitedVendor

# TODO update the JSON string below
json = "{}"
# create an instance of InvitedVendor from a JSON string
invited_vendor_instance = InvitedVendor.from_json(json)
# print the JSON string representation of the object
print(InvitedVendor.to_json())

# convert the object into a dict
invited_vendor_dict = invited_vendor_instance.to_dict()
# create an instance of InvitedVendor from a dict
invited_vendor_from_dict = InvitedVendor.from_dict(invited_vendor_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


