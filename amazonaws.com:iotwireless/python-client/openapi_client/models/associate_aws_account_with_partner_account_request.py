# coding: utf-8

"""
    AWS IoT Wireless

    <p>AWS IoT Wireless provides bi-directional communication between internet-connected wireless devices and the AWS Cloud. To onboard both LoRaWAN and Sidewalk devices to AWS IoT, use the IoT Wireless API. These wireless devices use the Low Power Wide Area Networking (LPWAN) communication protocol to communicate with AWS IoT.</p> <p>Using the API, you can perform create, read, update, and delete operations for your wireless devices, gateways, destinations, and profiles. After onboarding your devices, you can use the API operations to set log levels and monitor your devices with CloudWatch.</p> <p>You can also use the API operations to create multicast groups and schedule a multicast session for sending a downlink message to devices in the group. By using Firmware Updates Over-The-Air (FUOTA) API operations, you can create a FUOTA task and schedule a session to update the firmware of individual devices or an entire group of devices in a multicast group.</p>

    The version of the OpenAPI document: 2020-11-22
    Contact: mike.ralphson@gmail.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json

from pydantic import BaseModel, ConfigDict, Field, field_validator
from typing import Any, ClassVar, Dict, List, Optional
from typing_extensions import Annotated
from openapi_client.models.associate_aws_account_with_partner_account_request_sidewalk import AssociateAwsAccountWithPartnerAccountRequestSidewalk
from openapi_client.models.tag import Tag
from typing import Optional, Set
from typing_extensions import Self

class AssociateAwsAccountWithPartnerAccountRequest(BaseModel):
    """
    AssociateAwsAccountWithPartnerAccountRequest
    """ # noqa: E501
    sidewalk: AssociateAwsAccountWithPartnerAccountRequestSidewalk = Field(alias="Sidewalk")
    client_request_token: Optional[Annotated[str, Field(min_length=1, strict=True, max_length=64)]] = Field(default=None, description="Each resource must have a unique client request token. If you try to create a new resource with the same token as a resource that already exists, an exception occurs. If you omit this value, AWS SDKs will automatically generate a unique client request.", alias="ClientRequestToken")
    tags: Optional[Annotated[List[Tag], Field(min_length=0, max_length=200)]] = Field(default=None, description="The tag to attach to the specified resource. Tags are metadata that you can use to manage a resource.", alias="Tags")
    __properties: ClassVar[List[str]] = ["Sidewalk", "ClientRequestToken", "Tags"]

    @field_validator('client_request_token')
    def client_request_token_validate_regular_expression(cls, value):
        """Validates the regular expression"""
        if value is None:
            return value

        if not re.match(r"^[a-zA-Z0-9-_]+$", value):
            raise ValueError(r"must validate the regular expression /^[a-zA-Z0-9-_]+$/")
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
        """Create an instance of AssociateAwsAccountWithPartnerAccountRequest from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of sidewalk
        if self.sidewalk:
            _dict['Sidewalk'] = self.sidewalk.to_dict()
        # override the default output from pydantic by calling `to_dict()` of each item in tags (list)
        _items = []
        if self.tags:
            for _item_tags in self.tags:
                if _item_tags:
                    _items.append(_item_tags.to_dict())
            _dict['Tags'] = _items
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of AssociateAwsAccountWithPartnerAccountRequest from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "Sidewalk": AssociateAwsAccountWithPartnerAccountRequestSidewalk.from_dict(obj["Sidewalk"]) if obj.get("Sidewalk") is not None else None,
            "ClientRequestToken": obj.get("ClientRequestToken"),
            "Tags": [Tag.from_dict(_item) for _item in obj["Tags"]] if obj.get("Tags") is not None else None
        })
        return _obj


