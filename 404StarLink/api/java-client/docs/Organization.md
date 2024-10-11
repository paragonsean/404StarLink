

# Organization


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**description** | **String** | Your description for the organization. |  [optional] |
|**doingBusinessAs** | **String** | The organization&#39;s trading name, if different from the registered legal name. |  [optional] |
|**email** | **String** | The email address of the legal entity. |  [optional] |
|**legalName** | **String** | The organization&#39;s legal name. |  |
|**phone** | [**PhoneNumber2**](PhoneNumber2.md) |  |  [optional] |
|**principalPlaceOfBusiness** | [**Address3**](Address3.md) |  |  [optional] |
|**registeredAddress** | [**Address3**](Address3.md) |  |  |
|**registrationNumber** | **String** | The organization&#39;s registration number. |  [optional] |
|**stockData** | [**StockData**](StockData.md) |  |  [optional] |
|**taxExempt** | **Boolean** | Indicates whether the legal entity is exempt from tax. When **true**, the &#x60;taxIdAbsenceReason&#x60; must be provided.   |  [optional] |
|**taxId** | **String** | The organization&#39;s tax identifier. |  [optional] |
|**taxIdAbsenceReason** | [**TaxIdAbsenceReasonEnum**](#TaxIdAbsenceReasonEnum) | The reason the organization has not provided a tax identifier.  Possible values: **industryExemption**, **belowTaxThreshold**. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Type of organization.   Possible values: **associationIncorporated**, **governmentalOrganization**, **listedPublicCompany**, **nonProfit**, **partnershipIncorporated**, **privateCompany**. |  [optional] |
|**webData** | [**WebData**](WebData.md) |  |  [optional] |



## Enum: TaxIdAbsenceReasonEnum

| Name | Value |
|---- | -----|
| INDUSTRY_EXEMPTION | &quot;industryExemption&quot; |
| BELOW_TAX_THRESHOLD | &quot;belowTaxThreshold&quot; |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| ASSOCIATION_INCORPORATED | &quot;associationIncorporated&quot; |
| GOVERNMENTAL_ORGANIZATION | &quot;governmentalOrganization&quot; |
| LISTED_PUBLIC_COMPANY | &quot;listedPublicCompany&quot; |
| NON_PROFIT | &quot;nonProfit&quot; |
| PARTNERSHIP_INCORPORATED | &quot;partnershipIncorporated&quot; |
| PRIVATE_COMPANY | &quot;privateCompany&quot; |



