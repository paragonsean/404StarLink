# CreateUpdateAddressRequests


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**address_name** | **str** | Address name. | [optional] 
**address_type** | **str** | Type of address. For example, &#x60;Residential&#x60; or &#x60;Pickup&#x60;, among others. | [optional] 
**city** | **str** | City of the shipping address. | [optional] 
**complement** | **str** | Complement to the shipping address in case it applies. | [optional] 
**country** | **str** | Three letter ISO code of the country of the shipping address. | [optional] 
**neighborhood** | **str** | Neighborhood of the address. | [optional] 
**number** | **str** | Number of the building, house or apartment in the shipping address. | [optional] 
**postal_code** | **str** | Postal Code. | [optional] 
**receiver_name** | **str** | Name of the person who is going to receive the order. | [optional] 
**reference** | **str** | Complement that might help locate the shipping address more precisely in case of delivery. | [optional] 
**state** | **str** | State of the shipping address. | [optional] 
**street** | **str** | Street of the address. | [optional] 
**user_id** | **str** | ID of the customer to whom the address belongs. | [optional] 

## Example

```python
from openapi_client.models.create_update_address_requests import CreateUpdateAddressRequests

# TODO update the JSON string below
json = "{}"
# create an instance of CreateUpdateAddressRequests from a JSON string
create_update_address_requests_instance = CreateUpdateAddressRequests.from_json(json)
# print the JSON string representation of the object
print(CreateUpdateAddressRequests.to_json())

# convert the object into a dict
create_update_address_requests_dict = create_update_address_requests_instance.to_dict()
# create an instance of CreateUpdateAddressRequests from a dict
create_update_address_requests_from_dict = CreateUpdateAddressRequests.from_dict(create_update_address_requests_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


