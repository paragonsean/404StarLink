# ResolveCustomerResult

The result of the <code>ResolveCustomer</code> operation. Contains the <code>CustomerIdentifier</code> along with the <code>CustomerAWSAccountId</code> and <code>ProductCode</code>.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**customer_identifier** | **str** |  | [optional] 
**product_code** | **str** |  | [optional] 
**customer_aws_account_id** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.resolve_customer_result import ResolveCustomerResult

# TODO update the JSON string below
json = "{}"
# create an instance of ResolveCustomerResult from a JSON string
resolve_customer_result_instance = ResolveCustomerResult.from_json(json)
# print the JSON string representation of the object
print(ResolveCustomerResult.to_json())

# convert the object into a dict
resolve_customer_result_dict = resolve_customer_result_instance.to_dict()
# create an instance of ResolveCustomerResult from a dict
resolve_customer_result_from_dict = ResolveCustomerResult.from_dict(resolve_customer_result_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


