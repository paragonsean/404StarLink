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
from typing import Optional, Set
from typing_extensions import Self

class Season(BaseModel):
    """
    Season
    """ # noqa: E501
    api_season: Optional[StrictStr] = Field(default=None, alias="ApiSeason")
    description: Optional[StrictStr] = Field(default=None, alias="Description")
    end_year: Optional[StrictInt] = Field(default=None, alias="EndYear")
    post_season_start_date: Optional[StrictStr] = Field(default=None, alias="PostSeasonStartDate")
    regular_season_start_date: Optional[StrictStr] = Field(default=None, alias="RegularSeasonStartDate")
    season: Optional[StrictInt] = Field(default=None, alias="Season")
    season_type: Optional[StrictStr] = Field(default=None, alias="SeasonType")
    start_year: Optional[StrictInt] = Field(default=None, alias="StartYear")
    __properties: ClassVar[List[str]] = ["ApiSeason", "Description", "EndYear", "PostSeasonStartDate", "RegularSeasonStartDate", "Season", "SeasonType", "StartYear"]

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
        """Create an instance of Season from a JSON string"""
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
        # set to None if api_season (nullable) is None
        # and model_fields_set contains the field
        if self.api_season is None and "api_season" in self.model_fields_set:
            _dict['ApiSeason'] = None

        # set to None if description (nullable) is None
        # and model_fields_set contains the field
        if self.description is None and "description" in self.model_fields_set:
            _dict['Description'] = None

        # set to None if post_season_start_date (nullable) is None
        # and model_fields_set contains the field
        if self.post_season_start_date is None and "post_season_start_date" in self.model_fields_set:
            _dict['PostSeasonStartDate'] = None

        # set to None if regular_season_start_date (nullable) is None
        # and model_fields_set contains the field
        if self.regular_season_start_date is None and "regular_season_start_date" in self.model_fields_set:
            _dict['RegularSeasonStartDate'] = None

        # set to None if season_type (nullable) is None
        # and model_fields_set contains the field
        if self.season_type is None and "season_type" in self.model_fields_set:
            _dict['SeasonType'] = None

        return _dict

    @classmethod
    def from_dict(cls, obj: Optional[Dict[str, Any]]) -> Optional[Self]:
        """Create an instance of Season from a dict"""
        if obj is None:
            return None

        if not isinstance(obj, dict):
            return cls.model_validate(obj)

        _obj = cls.model_validate({
            "ApiSeason": obj.get("ApiSeason"),
            "Description": obj.get("Description"),
            "EndYear": obj.get("EndYear"),
            "PostSeasonStartDate": obj.get("PostSeasonStartDate"),
            "RegularSeasonStartDate": obj.get("RegularSeasonStartDate"),
            "Season": obj.get("Season"),
            "SeasonType": obj.get("SeasonType"),
            "StartYear": obj.get("StartYear")
        })
        return _obj


