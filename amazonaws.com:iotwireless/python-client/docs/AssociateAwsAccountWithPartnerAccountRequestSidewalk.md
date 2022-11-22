# AssociateAwsAccountWithPartnerAccountRequestSidewalk

Information about a Sidewalk account.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**amazon_id** | **str** |  | [optional] 
**app_server_private_key** | **str** |  | [optional] 

## Example

```python
from openapi_client.models.associate_aws_account_with_partner_account_request_sidewalk import AssociateAwsAccountWithPartnerAccountRequestSidewalk

# TODO update the JSON string below
json = "{}"
# create an instance of AssociateAwsAccountWithPartnerAccountRequestSidewalk from a JSON string
associate_aws_account_with_partner_account_request_sidewalk_instance = AssociateAwsAccountWithPartnerAccountRequestSidewalk.from_json(json)
# print the JSON string representation of the object
print(AssociateAwsAccountWithPartnerAccountRequestSidewalk.to_json())

# convert the object into a dict
associate_aws_account_with_partner_account_request_sidewalk_dict = associate_aws_account_with_partner_account_request_sidewalk_instance.to_dict()
# create an instance of AssociateAwsAccountWithPartnerAccountRequestSidewalk from a dict
associate_aws_account_with_partner_account_request_sidewalk_from_dict = AssociateAwsAccountWithPartnerAccountRequestSidewalk.from_dict(associate_aws_account_with_partner_account_request_sidewalk_dict)
```
[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


