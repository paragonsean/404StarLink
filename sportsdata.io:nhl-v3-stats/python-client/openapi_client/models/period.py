# coding: utf-8

"""
    NHL v3 Stats

    No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)

    The version of the OpenAPI document: 1.0
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


from __future__ import annotations
import pprint
import re  # noqa: F401
import json

from pydantic import BaseModel, ConfigDict, Field, StrictInt, StrictStr
from typing import Any, ClassVar, Dict, List, Optional
from openapi_client.models.penalty import Penalty
from openapi_client.models.scoring_play import ScoringPlay
from typing import Optional, Set
from typing_extensions import Self

class Period(BaseModel):
    """
    Period
    """ # noqa: E501
    away_score: Optional[StrictInt] = Field(default=None, alias="AwayScore")
    game_id: Optional[StrictInt] = Field(default=None, alias="GameID")
    home_score: Optional[StrictInt] = Field(default=None, alias="HomeScore")
    name: Optional[StrictStr] = Field(default=None, alias="Name")
    penalties: Optional[List[Penalty]] = Field(default=None, alias="Penalties")
    period_id: Optional[StrictInt] = Field(default=None, alias="PeriodID")
    scoring_plays: Optional[List[ScoringPlay]] = Field(default=None, alias="ScoringPlays")
    __properties: ClassVar[List[str]] = ["AwayScore", "GameID", "HomeScore", "Name", "Penalties", "PeriodID", "ScoringPlays"]

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
        """Create an instance of Period from a JSON string"""
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
        # override the default output from pydantic by calling `to_dict()` of each item in penalties (list)
        _items = []
        if self.penalties:
            for _item_penalties in self.penalties:
                if _item_penalties:
                    _items.append(_item_penalties.to_dict())
            _dict['Penalties'] = _items
        # override the default output from pydantic by calling `to_dict()` of each item in scoring_plays (list)
        _items = []
        if self.scoring_plays:
            for _item_scoring_plays in self.scoring_plays:
                if _item_scoring_plays:
                    _items.append(_item_scoring_plays.to_dict())
            _dict['ScoringPlays'] = _items
        # set to None if away_score (nullable) is None
        # and model_fields_set contains the field
        if self.away_score is None and "away_score" in self.model_fields_set:
            _dict['AwayScore'] = None

        # set to None if home_score (nullable) is None
        # and model_fields_set contains the field
        if self.home_score is None and "home_score" in self.model_fields_set:
            _dict['HomeScore'] = None

        # set to None if name (nullable) is None
        # and model_fields_set contains the field
        if self.name is None and "name" in self.model_fields_set:
            _dict['Name'] = None

        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of Period from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "AwayScore": obj.get("AwayScore"),
            "GameID": obj.get("GameID"),
            "HomeScore": obj.get("HomeScore"),
            "Name": obj.get("Name"),
            "Penalties": [Penalty.from_dict(_item) for _item in obj["Penalties"]] if obj.get("Penalties") is not None else None,
            "PeriodID": obj.get("PeriodID"),
            "ScoringPlays": [ScoringPlay.from_dict(_item) for _item in obj["ScoringPlays"]] if obj.get("ScoringPlays") is not None else None
        })
        return _obj


