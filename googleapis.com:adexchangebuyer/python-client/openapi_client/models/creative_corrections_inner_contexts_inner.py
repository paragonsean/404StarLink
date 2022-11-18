# coding: utf-8

"""
    Ad Exchange Buyer API

    Accesses your bidding-account information, submits creatives for validation, finds available direct deals, and retrieves performance reports.

    The version of the OpenAPI document: v1.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json

from pydantic import BaseModel, ConfigDict, Field, StrictInt, StrictStr
from typing import Any, ClassVar, Dict, List, Optional
from typing import Optional, Set
from typing_extensions import Self

class CreativeCorrectionsInnerContextsInner(BaseModel):
    """
    CreativeCorrectionsInnerContextsInner
    """ # noqa: E501
    auction_type: Optional[List[StrictStr]] = Field(default=None, description="Only set when contextType=AUCTION_TYPE. Represents the auction types this correction applies to.", alias="auctionType")
    context_type: Optional[StrictStr] = Field(default=None, description="The type of context (e.g., location, platform, auction type, SSL-ness).", alias="contextType")
    geo_criteria_id: Optional[List[StrictInt]] = Field(default=None, description="Only set when contextType=LOCATION. Represents the geo criterias this correction applies to.", alias="geoCriteriaId")
    platform: Optional[List[StrictStr]] = Field(default=None, description="Only set when contextType=PLATFORM. Represents the platforms this correction applies to.")
    __properties: ClassVar[List[str]] = ["auctionType", "contextType", "geoCriteriaId", "platform"]

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
        """Create an instance of CreativeCorrectionsInnerContextsInner from a JSON string"""
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
        """Create an instance of CreativeCorrectionsInnerContextsInner from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "auctionType": obj.get("auctionType"),
            "contextType": obj.get("contextType"),
            "geoCriteriaId": obj.get("geoCriteriaId"),
            "platform": obj.get("platform")
        })
        return _obj


