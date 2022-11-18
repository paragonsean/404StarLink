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

from pydantic import BaseModel, ConfigDict, Field, StrictBool, StrictStr
from typing import Any, ClassVar, Dict, List, Optional
from typing import Optional, Set
from typing_extensions import Self

class DealServingMetadataDealPauseStatus(BaseModel):
    """
    Tracks which parties (if any) have paused a deal. The deal is considered paused if has_buyer_paused || has_seller_paused. Each of the has_buyer_paused or the has_seller_paused bits can be set independently.
    """ # noqa: E501
    buyer_pause_reason: Optional[StrictStr] = Field(default=None, alias="buyerPauseReason")
    first_paused_by: Optional[StrictStr] = Field(default=None, description="If the deal is paused, records which party paused the deal first.", alias="firstPausedBy")
    has_buyer_paused: Optional[StrictBool] = Field(default=None, alias="hasBuyerPaused")
    has_seller_paused: Optional[StrictBool] = Field(default=None, alias="hasSellerPaused")
    seller_pause_reason: Optional[StrictStr] = Field(default=None, alias="sellerPauseReason")
    __properties: ClassVar[List[str]] = ["buyerPauseReason", "firstPausedBy", "hasBuyerPaused", "hasSellerPaused", "sellerPauseReason"]

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
        """Create an instance of DealServingMetadataDealPauseStatus from a JSON string"""
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
        """Create an instance of DealServingMetadataDealPauseStatus from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "buyerPauseReason": obj.get("buyerPauseReason"),
            "firstPausedBy": obj.get("firstPausedBy"),
            "hasBuyerPaused": obj.get("hasBuyerPaused"),
            "hasSellerPaused": obj.get("hasSellerPaused"),
            "sellerPauseReason": obj.get("sellerPauseReason")
        })
        return _obj


