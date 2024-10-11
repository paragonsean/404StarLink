# AssociateAwsAccountWithPartnerAccountResponse


## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sidewalk** | [**AssociateAwsAccountWithPartnerAccountResponseSidewalk**](AssociateAwsAccountWithPartnerAccountResponseSidewalk.md) |  | [optional] 
**arn** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.associate_aws_account_with_partner_account_response import AssociateAwsAccountWithPartnerAccountResponse

# TODO update the JSON string below
json = "{}"
# create an instance of AssociateAwsAccountWithPartnerAccountResponse from a JSON string
associate_aws_account_with_partner_account_response_instance = AssociateAwsAccountWithPartnerAccountResponse.from_json(json)
# print the JSON string representation of the object
print(AssociateAwsAccountWithPartnerAccountResponse.to_json())

# convert the object into a dict
associate_aws_account_with_partner_account_response_dict = associate_aws_account_with_partner_account_response_instance.to_dict()
# create an instance of AssociateAwsAccountWithPartnerAccountResponse from a dict
associate_aws_account_with_partner_account_response_from_dict = AssociateAwsAccountWithPartnerAccountResponse.from_dict(associate_aws_account_with_partner_account_response_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


