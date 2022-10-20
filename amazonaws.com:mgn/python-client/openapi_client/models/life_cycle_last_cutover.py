# coding: utf-8

"""
    Application Migration Service

    The Application Migration Service service.

    The version of the OpenAPI document: 2020-02-26
    Contact: mike.ralphson@gmail.com
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json

from pydantic import BaseModel, ConfigDict
from typing import Any, ClassVar, Dict, List, Optional
from openapi_client.models.life_cycle_last_cutover_finalized import LifeCycleLastCutoverFinalized
from openapi_client.models.life_cycle_last_cutover_initiated import LifeCycleLastCutoverInitiated
from openapi_client.models.life_cycle_last_cutover_reverted import LifeCycleLastCutoverReverted
from typing import Optional, Set
from typing_extensions import Self

class LifeCycleLastCutover(BaseModel):
    """
    LifeCycleLastCutover
    """ # noqa: E501
    finalized: Optional[LifeCycleLastCutoverFinalized] = None
    initiated: Optional[LifeCycleLastCutoverInitiated] = None
    reverted: Optional[LifeCycleLastCutoverReverted] = None
    __properties: ClassVar[List[str]] = ["finalized", "initiated", "reverted"]

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
        """Create an instance of LifeCycleLastCutover from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of finalized
        if self.finalized:
            _dict['finalized'] = self.finalized.to_dict()
        # override the default output from pydantic by calling `to_dict()` of initiated
        if self.initiated:
            _dict['initiated'] = self.initiated.to_dict()
        # override the default output from pydantic by calling `to_dict()` of reverted
        if self.reverted:
            _dict['reverted'] = self.reverted.to_dict()
        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of LifeCycleLastCutover from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "finalized": LifeCycleLastCutoverFinalized.from_dict(obj["finalized"]) if obj.get("finalized") is not None else None,
            "initiated": LifeCycleLastCutoverInitiated.from_dict(obj["initiated"]) if obj.get("initiated") is not None else None,
            "reverted": LifeCycleLastCutoverReverted.from_dict(obj["reverted"]) if obj.get("reverted") is not None else None
        })
        return _obj


