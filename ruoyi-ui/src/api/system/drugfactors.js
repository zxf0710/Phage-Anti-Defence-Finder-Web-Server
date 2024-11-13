import request from '@/utils/request'

// 查询【请填写功能名称】列表
export function listDrugfactors(query) {
  return request({
    url: '/system/drugfactors/list',
    method: 'get',
    params: query
  })
}

// 查询【请填写功能名称】详细
export function getDrugfactors(elderlyId) {
  return request({
    url: '/system/drugfactors/' + elderlyId,
    method: 'get'
  })
}

// 新增【请填写功能名称】
export function addDrugfactors(data) {
  return request({
    url: '/system/drugfactors',
    method: 'post',
    data: data
  })
}

// 修改【请填写功能名称】
export function updateDrugfactors(data) {
  return request({
    url: '/system/drugfactors',
    method: 'put',
    data: data
  })
}

// 删除【请填写功能名称】
export function delDrugfactors(elderlyId) {
  return request({
    url: '/system/drugfactors/' + elderlyId,
    method: 'delete'
  })
}
