# coding: utf-8

"""
    Legal Entity Management API

    The Legal Entity Management API enables you to manage legal entities that contain information required for verification.  ## Authentication To connect to the Legal Entity Management API, you must use the basic authentication credentials of your web service user. If you don't have one, contact the [Adyen Support Team](https://www.adyen.help/hc/en-us/requests/new). Use the web service user credentials to authenticate your request, for example:  ``` curl -U \"ws_123456@Scope.BalancePlatform_YourBalancePlatform\":\"YourWsPassword\" \\ -H \"Content-Type: application/json\" \\ ... ``` Note that when going live, you need to generate new web service user credentials to access the [live endpoints](https://docs.adyen.com/development-resources/live-endpoints).  ## Versioning The Legal Entity Management API supports versioning of its endpoints through a version suffix in the endpoint URL. This suffix has the following format: \"vXX\", where XX is the version number.  For example: ``` https://kyc-test.adyen.com/lem/v3/legalEntities ``` ## Going live When going live, your Adyen contact will provide your API credential for the live environment. You can then use the username and password to send requests to `https://kyc-live.adyen.com/lem/v3`.  

    The version of the OpenAPI document: 3
    Contact: developer-experience@adyen.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json

from pydantic import BaseModel, ConfigDict, Field, StrictStr, field_validator
from typing import Any, ClassVar, Dict, List, Optional
from typing import Optional, Set
from typing_extensions import Self

class AcceptTermsOfServiceResponse(BaseModel):
    """
    AcceptTermsOfServiceResponse
    """ # noqa: E501
    accepted_by: Optional[StrictStr] = Field(default=None, description="The unique identifier of the user that accepted the Terms of Service.", alias="acceptedBy")
    id: Optional[StrictStr] = Field(default=None, description="The unique identifier of the Terms of Service acceptance.")
    ip_address: Optional[StrictStr] = Field(default=None, description="The IP address of the user that accepted the Terms of Service.", alias="ipAddress")
    language: Optional[StrictStr] = Field(default=None, description="The language used for the Terms of Service document, specified by the two letter [ISO 639-1](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes) language code. For example, **nl** for Dutch.")
    terms_of_service_document_id: Optional[StrictStr] = Field(default=None, description="The unique identifier of the Terms of Service document.", alias="termsOfServiceDocumentId")
    type: Optional[StrictStr] = Field(default=None, description="The type of Terms of Service.")
    __properties: ClassVar[List[str]] = ["acceptedBy", "id", "ipAddress", "language", "termsOfServiceDocumentId", "type"]

    @field_validator('type')
    def type_validate_enum(cls, value):
        """Validates the enum"""
        if value is None:
            return value

        if value not in set(['adyenAccount', 'adyenCapital', 'adyenCard', 'adyenForPlatformsAdvanced', 'adyenForPlatformsManage', 'adyenFranchisee', 'adyenIssuing']):
            raise ValueError("must be one of enum values ('adyenAccount', 'adyenCapital', 'adyenCard', 'adyenForPlatformsAdvanced', 'adyenForPlatformsManage', 'adyenFranchisee', 'adyenIssuing')")
        return value

    model_config = ConfigDict(
        populate_by_name=True,
        validate_assignment=True,
        protected_namespaces=(),
    )


    def to_str(self) -> str:
        """Returns the string representation of the model using alias"""
        return pprint.pformat(self.model_dump(by_alias=True))

    def to_json(self) -> str:
        """Returns the JSON representation of the model using alias"""
        # TODO: pydantic v2: use .model_dump_json(by_alias=True, exclude_unset=True) instead
        return json.dumps(self.to_dict())

    @classmethod
    def from_json(cls, json_str: str) -> Optional[Self]:
        """Create an instance of AcceptTermsOfServiceResponse from a JSON string"""
        return cls.from_dict(json.loads(json_str))

    def to_dict(self) -> Dict[str, Any]:
        """Return the dictionary representation of the model using alias.

        This has the following differences from calling pydantic's
        `self.model_dump(by_alias=True)`:

        * `None` is only added to the output dict for nullable fields that
          were set at model initialization. Other fields with value `None`
          are ignored.
        """
        excluded_fields: Set[str] = set([
        ])

        _dict = self.model_dump(
            by_alias=True,
            exclude=excluded_fields,
            exclude_none=True,
        )
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of AcceptTermsOfServiceResponse from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "acceptedBy": obj.get("acceptedBy"),
            "id": obj.get("id"),
            "ipAddress": obj.get("ipAddress"),
            "language": obj.get("language"),
            "termsOfServiceDocumentId": obj.get("termsOfServiceDocumentId"),
            "type": obj.get("type")
        })
        return _obj


