# AssociateAwsAccountWithPartnerAccountRequest


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sidewalk** | [**AssociateAwsAccountWithPartnerAccountRequestSidewalk**](AssociateAwsAccountWithPartnerAccountRequestSidewalk.md) |  | 
**client_request_token** | **str** | Each resource must have a unique client request token. If you try to create a new resource with the same token as a resource that already exists, an exception occurs. If you omit this value, AWS SDKs will automatically generate a unique client request. | [optional] 
**tags** | [**List[Tag]**](Tag.md) | The tag to attach to the specified resource. Tags are metadata that you can use to manage a resource. | [optional] 

## Example

```python
from openapi_client.models.associate_aws_account_with_partner_account_request import AssociateAwsAccountWithPartnerAccountRequest

# TODO update the JSON string below
json = "{}"
# create an instance of AssociateAwsAccountWithPartnerAccountRequest from a JSON string
associate_aws_account_with_partner_account_request_instance = AssociateAwsAccountWithPartnerAccountRequest.from_json(json)
# print the JSON string representation of the object
print(AssociateAwsAccountWithPartnerAccountRequest.to_json())

# convert the object into a dict
associate_aws_account_with_partner_account_request_dict = associate_aws_account_with_partner_account_request_instance.to_dict()
# create an instance of AssociateAwsAccountWithPartnerAccountRequest from a dict
associate_aws_account_with_partner_account_request_from_dict = AssociateAwsAccountWithPartnerAccountRequest.from_dict(associate_aws_account_with_partner_account_request_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


