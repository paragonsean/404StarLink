# ResolveCustomerRequest

Contains input to the <code>ResolveCustomer</code> operation.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**registration_token** | **str** |  | 

## Example

```python
from openapi_client.models.resolve_customer_request import ResolveCustomerRequest

# TODO update the JSON string below
json = "{}"
# create an instance of ResolveCustomerRequest from a JSON string
resolve_customer_request_instance = ResolveCustomerRequest.from_json(json)
# print the JSON string representation of the object
print(ResolveCustomerRequest.to_json())

# convert the object into a dict
resolve_customer_request_dict = resolve_customer_request_instance.to_dict()
# create an instance of ResolveCustomerRequest from a dict
resolve_customer_request_from_dict = ResolveCustomerRequest.from_dict(resolve_customer_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


